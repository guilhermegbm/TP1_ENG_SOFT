<template>
  <div id="app">
    <b-navbar sticky toggleable="lg" type="dark" variant="info">
      <b-navbar-brand href="#">
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