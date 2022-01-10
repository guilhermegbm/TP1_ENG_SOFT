<template>
  <div id="app">
    <!--Navbar fixa no topo da tela-->
    <b-navbar sticky toggleable="lg" type="dark" variant="info">
      <b-navbar-brand href="#" v-b-toggle.main-menu-sidebar>
        <font-awesome-icon icon="bars" fixed-width />
      </b-navbar-brand>

      <b-navbar-brand>I-Shop</b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <!-- Alinhado à direita -->
        <b-navbar-nav class="ml-auto">
          <b-nav-item-dropdown text="Lang" right>
            <b-dropdown-item href="#">EN</b-dropdown-item>
            <b-dropdown-item href="#">ES</b-dropdown-item>
            <b-dropdown-item href="#">RU</b-dropdown-item>
            <b-dropdown-item href="#">FA</b-dropdown-item>
          </b-nav-item-dropdown>

          <b-nav-item-dropdown right>
            <!-- Using 'button-content' slot -->
            <template #button-content>
              <em>Guilherme Barboza</em>
            </template>
            <b-dropdown-item href="#">Perfil</b-dropdown-item>
            <b-dropdown-item href="#">Sair</b-dropdown-item>
          </b-nav-item-dropdown>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>

    <!--Sidebar "Togleable" lateral com menu de opções-->

    <b-sidebar id="main-menu-sidebar" title="Menu" shadow>
      <div class="px-3 py-2">
        <b-row class="dashboard-item">
          <b-col cols="12">Dashboard</b-col>
        </b-row>
        <b-row class="dashboard-item">
          <b-col cols="12">Produtos</b-col>
        </b-row>
        <b-row class="dashboard-item">
          <b-col cols="12">Histórico de Compras</b-col>
        </b-row>
        <b-row class="dashboard-item">
          <b-col cols="12">Meu Perfil</b-col>
        </b-row>
        <b-row class="dashboard-item">
          <b-col cols="12">Segurança</b-col>
        </b-row>
        <b-row class="dashboard-item">
          <b-col cols="12">Privacidade</b-col>
        </b-row>
        <b-row class="dashboard-item">
          <b-col cols="12">Dúvidas</b-col>
        </b-row>
        <b-row class="dashboard-item">
          <b-col cols="12">Fale conosco</b-col>
        </b-row>
      </div>

      <template #footer>
        <hr style="margin: 0px" />
        <div class="d-flex align-items-center px-3 py-2">
          <font-awesome-icon style="margin-left: 90px" icon="info-circle" fixed-width size="lg" />
          <font-awesome-icon style="margin-left: 10px" icon="file-signature" fixed-width size="lg" />
          <font-awesome-icon style="margin-left: 8px" icon="star" fixed-width size="lg" />
        </div>
      </template>
    </b-sidebar>

    <b-row class="header">
      <b-col cols="12">
        <b-button v-b-toggle.main-menu-sidebar>Toggle Sidebar</b-button>
      </b-col>
    </b-row>

    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>

    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>

    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>

    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>

    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>
    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>

    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>
    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>
    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>

    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>
    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>
    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>

    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>
    <b-row class="header">
      <b-col cols="12">Teste</b-col>
    </b-row>

    <p>Dashboard</p>
  </div>
</template>

<script>
export default {
  data() {
    return {
      teste: "teste"
    };
  },

  methods: {}
};
</script>

<style>
</style>