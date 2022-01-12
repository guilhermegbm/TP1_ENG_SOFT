<template>
  <b-card header-tag="header" class="container-login">
    <template v-slot:header>
      <h3 class="mb-0">Login</h3>
    </template>
    <b-form v-on:submit.prevent="fazerLogin()">
      <b-form-row>
        <b-col cols="12">
          <label for="login-email" class="login-label mt-3 mb-1">Email:</label>
          <b-form-input
            id="login-email"
            v-model="loginData.email"
            placeholder="Insira o seu email de acesso"
            v-bind:state="valid_email"
          ></b-form-input>
        </b-col>
      </b-form-row>
      <b-form-row>
        <b-col cols="12">
          <label for="login-senha" class="login-label mt-3 mb-1">Senha:</label>
          <b-form-input
            id="login-senha"
            v-model="loginData.senha"
            placeholder="Insira a sua Senha"
            v-bind:state="valid_senha"
            type="password"
          ></b-form-input>
        </b-col>
      </b-form-row>
      <hr class="mt-3 mb-3" />
      <b-form-row>
        <b-col cols="12">
          <b-button
            block
            squared
            variant="outline-info"
            v-bind:disabled="loadingFazerLogin"
            type="submit"
          >
            <font-awesome-icon v-show="loadingFazerLogin" icon="circle-notch" spin fixed-width />Fazer Login
          </b-button>
        </b-col>
      </b-form-row>
    </b-form>
  </b-card>
</template>

<script>
export default {
  data() {
    return {
      loginData: {
        email: "",
        senha: ""
      },

      loadingFazerLogin: false,

      valid_email: null,
      valid_senha: null,
    };
  },

  methods: {
    sleep: function(ms) {
      return new Promise(resolve => setTimeout(resolve, ms));
    },

    fazerLogin: async function() {
      if (!this.validateForm()) {
        return;
      }
      this.loadingFazerLogin = true;

      this.axios
        .get(
          "http://localhost:8080/ishop/user/login?email=" +
            this.loginData.email +
            "&password=" +
            this.loginData.senha
        )
        .then(response => {
          let usuarioEncontrado = response.data;

          if (usuarioEncontrado) {
            let caminho = "/dashboard";
            this.$router.push({ path: caminho });
          } else {
            this.mensagem("Email ou senha incorretos", "Atenção", "warning");
          }
        })
        .catch(exception => {
          console.log(exception);
          this.mensagem("Erro ao fazer login", "Atenção", "warning");
        })
        .finally(() => {
          this.loadingFazerLogin = false;
        });
    },
    validateForm: function() {
      let formValido = true;

      if (this.loginData.email == "") {
        this.valid_email = false;
        formValido = false;
      } else {
        this.valid_email = null;
      }

      if (this.loginData.senha == "") {
        this.valid_senha = false;
        formValido = false;
      } else {
        this.valid_senha = null;
      }

      if (this.loadingFazerLogin) {
        formValido = false;
      }

      return formValido;
    },

    mensagem(msg = "", titulo = "Mensagem", variant = null) {
      this.$bvToast.toast(msg, {
        title: titulo,
        autoHideDelay: 6000,
        appendToast: true,
        variant: variant,
        toaster: "b-toaster-bottom-right"
      });
    },

    setarLocalStorage: function() {
      let teste = {
        valor: "teste"
      };
      localStorage.setItem("teste", JSON.stringify(teste));
    },
    getLocalStorage: function() {
      let teste = localStorage.getItem("teste");
      if (teste == null) {
        console.log("Valor nulo");
      } else {
        console.log(JSON.parse(teste));
      }
    },
    delLocalStorage: function() {
      if (localStorage.getItem("teste")) {
        localStorage.removeItem("teste");
        console.log("Valor deletado");
      } else {
        console.log("Nada para deletar");
      }
    }
  }
};
</script>

<style>
</style>