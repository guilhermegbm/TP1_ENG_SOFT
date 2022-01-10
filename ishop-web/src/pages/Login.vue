<template>
  <b-card header-tag="header" class="container-login">
    <template v-slot:header>
      <h3 class="mb-0">Login</h3>
    </template>
    <b-form v-on:submit.prevent="fazerLogin()">
      <b-form-row>
        <b-col cols="12">Teste</b-col>
      </b-form-row>
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
      valid_senha: null
    };
  },

  methods: {
    fazerLogin: function() {
      if (!this.validateForm()) {
        return;
      }
      this.loadingFazerLogin = true;

      let formData = new FormData();
      formData.append("login", this.loginData.email);
      formData.append("senha", this.loginData.senha);

      /*axios
        .post(this.$pathManager.fazerLogin(), formData, {
          headers: {
            "Content-Type": "multipart/form-data"
          }
        })
        .then(response => {
          this.loadingFazerLogin = false;

          //TODO: Retornar os dados do usuário que está logando e colocá-los no   localStorage
          if (
            response.status == 200 &&
            response.data != null &&
            response.data != ""
          ) {
            let usuarioLogado = response.data;
            localStorage.setItem(
              "usuarioLogado",
              JSON.stringify(usuarioLogado)
            );

            let caminho = "/dap/enviarDaps";
            this.$router.push({ path: caminho });
          }
        })
        .catch(exception => {
          this.loadingFazerLogin = false;
          if (exception.response.status == 400) {
            this.mensagem(exception.response.data, "Atenção", "warning");
          } else if (exception.response.status == 500) {
            if (Array.isArray(exception.response.data)) {
              for (var i = 0; i < exception.response.data.length; i++) {
                this.mensagem(
                  exception.response.data[i].mensagem,
                  "Erro",
                  "danger"
                );
              }
            } else {
              this.mensagem(exception.response.data.mensagem, "Erro", "danger");
            }
          }
        });*/
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