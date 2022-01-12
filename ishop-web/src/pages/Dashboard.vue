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

    <div id="content">
      <div class="container-listas-produtos">
        <b-row>
          <b-col cols="12">
            <h3>Recomendados</h3>
            <hr />
          </b-col>
        </b-row>

        <b-row>
          <b-col cols="3">
            <b-card style="max-width: 20rem;">
              <b-card-img
                :src="require('../assets/images/notebook-1.webp')"
                alt="notebook-1"
                top="true"
              ></b-card-img>

              <b-card-text>Notebook Lenovo Ultrafino Ideapad 3i I3-10110u 4GB 256GB SSD Tela 15,6" Windows 11 - Prata</b-card-text>

              <b-card-title>R$ 2832,99</b-card-title>

              <b-button-group style="width: 100%">
                <b-button variant="success">
                  <font-awesome-icon icon="cart-plus" fixed-width size="lg" />
                </b-button>
                <b-button variant="primary">
                  <font-awesome-icon icon="info-circle" fixed-width size="lg" />
                </b-button>
                <b-button variant="info">
                  <font-awesome-icon icon="heart" fixed-width size="lg" />
                </b-button>
              </b-button-group>
            </b-card>
          </b-col>
          <b-col cols="3">
            <b-card style="max-width: 20rem;">
              <b-card-img
                :src="require('../assets/images/notebook-1.webp')"
                alt="notebook-1"
                top="true"
              ></b-card-img>

              <b-card-text>Notebook Lenovo Ultrafino Ideapad 3i I3-10110u 4GB 256GB SSD Tela 15,6" Windows 11 - Prata</b-card-text>

              <b-card-title>R$ 2832,99</b-card-title>

              <b-button-group style="width: 100%">
                <b-button variant="success">
                  <font-awesome-icon icon="cart-plus" fixed-width size="lg" />
                </b-button>
                <b-button variant="primary">
                  <font-awesome-icon icon="info-circle" fixed-width size="lg" />
                </b-button>
                <b-button variant="info">
                  <font-awesome-icon icon="heart" fixed-width size="lg" />
                </b-button>
              </b-button-group>
            </b-card>
          </b-col>
          <b-col cols="3">
            <b-card style="max-width: 20rem;">
              <b-card-img
                :src="require('../assets/images/notebook-1.webp')"
                alt="notebook-1"
                top="true"
              ></b-card-img>

              <b-card-text>Notebook Lenovo Ultrafino Ideapad 3i I3-10110u 4GB 256GB SSD Tela 15,6" Windows 11 - Prata</b-card-text>

              <b-card-title>R$ 2832,99</b-card-title>

              <b-button-group style="width: 100%">
                <b-button variant="success">
                  <font-awesome-icon icon="cart-plus" fixed-width size="lg" />
                </b-button>
                <b-button variant="primary">
                  <font-awesome-icon icon="info-circle" fixed-width size="lg" />
                </b-button>
                <b-button variant="info">
                  <font-awesome-icon icon="heart" fixed-width size="lg" />
                </b-button>
              </b-button-group>
            </b-card>
          </b-col>
          <b-col cols="3">
            <b-card style="max-width: 20rem;">
              <b-card-img
                :src="require('../assets/images/notebook-1.webp')"
                alt="notebook-1"
                top="true"
              ></b-card-img>

              <b-card-text>Notebook Lenovo Ultrafino Ideapad 3i I3-10110u 4GB 256GB SSD Tela 15,6" Windows 11 - Prata</b-card-text>

              <b-card-title>R$ 2832,99</b-card-title>

              <b-button-group style="width: 100%">
                <b-button variant="success">
                  <font-awesome-icon icon="cart-plus" fixed-width size="lg" />
                </b-button>
                <b-button variant="primary">
                  <font-awesome-icon icon="info-circle" fixed-width size="lg" />
                </b-button>
                <b-button variant="info">
                  <font-awesome-icon icon="heart" fixed-width size="lg" />
                </b-button>
              </b-button-group>
            </b-card>
          </b-col>
        </b-row>

        <b-row>
          <b-col cols="12">
            <br />
          </b-col>
        </b-row>

        <b-row>
          <b-col cols="12">
            <h3>Baseado no seu histórico de pesquisas:</h3>
            <hr />
          </b-col>
        </b-row>

        <b-row>
          <b-col cols="3">
            <b-card style="max-width: 20rem;">
              <b-card-img
                :src="require('../assets/images/notebook-1.webp')"
                alt="notebook-1"
                top="true"
              ></b-card-img>

              <b-card-text>Notebook Lenovo Ultrafino Ideapad 3i I3-10110u 4GB 256GB SSD Tela 15,6" Windows 11 - Prata</b-card-text>

              <b-card-title>R$ 2832,99</b-card-title>

              <b-button-group style="width: 100%">
                <b-button variant="success">
                  <font-awesome-icon icon="cart-plus" fixed-width size="lg" />
                </b-button>
                <b-button variant="primary">
                  <font-awesome-icon icon="info-circle" fixed-width size="lg" />
                </b-button>
                <b-button variant="info">
                  <font-awesome-icon icon="heart" fixed-width size="lg" />
                </b-button>
              </b-button-group>
            </b-card>
          </b-col>
          <b-col cols="3">
            <b-card style="max-width: 20rem;">
              <b-card-img
                :src="require('../assets/images/notebook-1.webp')"
                alt="notebook-1"
                top="true"
              ></b-card-img>

              <b-card-text>Notebook Lenovo Ultrafino Ideapad 3i I3-10110u 4GB 256GB SSD Tela 15,6" Windows 11 - Prata</b-card-text>

              <b-card-title>R$ 2832,99</b-card-title>

              <b-button-group style="width: 100%">
                <b-button variant="success">
                  <font-awesome-icon icon="cart-plus" fixed-width size="lg" />
                </b-button>
                <b-button variant="primary">
                  <font-awesome-icon icon="info-circle" fixed-width size="lg" />
                </b-button>
                <b-button variant="info">
                  <font-awesome-icon icon="heart" fixed-width size="lg" />
                </b-button>
              </b-button-group>
            </b-card>
          </b-col>
          <b-col cols="3">
            <b-card style="max-width: 20rem;">
              <b-card-img
                :src="require('../assets/images/notebook-1.webp')"
                alt="notebook-1"
                top="true"
              ></b-card-img>

              <b-card-text>Notebook Lenovo Ultrafino Ideapad 3i I3-10110u 4GB 256GB SSD Tela 15,6" Windows 11 - Prata</b-card-text>

              <b-card-title>R$ 2832,99</b-card-title>

              <b-button-group style="width: 100%">
                <b-button variant="success">
                  <font-awesome-icon icon="cart-plus" fixed-width size="lg" />
                </b-button>
                <b-button variant="primary">
                  <font-awesome-icon icon="info-circle" fixed-width size="lg" />
                </b-button>
                <b-button variant="info">
                  <font-awesome-icon icon="heart" fixed-width size="lg" />
                </b-button>
              </b-button-group>
            </b-card>
          </b-col>
          <b-col cols="3">
            <b-card style="max-width: 20rem;">
              <b-card-img
                :src="require('../assets/images/notebook-1.webp')"
                alt="notebook-1"
                top="true"
              ></b-card-img>

              <b-card-text>Notebook Lenovo Ultrafino Ideapad 3i I3-10110u 4GB 256GB SSD Tela 15,6" Windows 11 - Prata</b-card-text>

              <b-card-title>R$ 2832,99</b-card-title>

              <b-button-group style="width: 100%">
                <b-button variant="success">
                  <font-awesome-icon icon="cart-plus" fixed-width size="lg" />
                </b-button>
                <b-button variant="primary">
                  <font-awesome-icon icon="info-circle" fixed-width size="lg" />
                </b-button>
                <b-button variant="info">
                  <font-awesome-icon icon="heart" fixed-width size="lg" />
                </b-button>
              </b-button-group>
            </b-card>
          </b-col>
        </b-row>

        <b-row>
          <b-col cols="12">
            <br />
          </b-col>
        </b-row>

        <b-row>
          <b-col cols="12">
            <h3>Favoritos</h3>
            <hr />
          </b-col>
        </b-row>

        <b-row>
          <b-col cols="3">
            <b-card style="max-width: 20rem;">
              <b-card-img
                :src="require('../assets/images/notebook-1.webp')"
                alt="notebook-1"
                top="true"
              ></b-card-img>

              <b-card-text>Notebook Lenovo Ultrafino Ideapad 3i I3-10110u 4GB 256GB SSD Tela 15,6" Windows 11 - Prata</b-card-text>

              <b-card-title>R$ 2832,99</b-card-title>

              <b-button-group style="width: 100%">
                <b-button variant="success">
                  <font-awesome-icon icon="cart-plus" fixed-width size="lg" />
                </b-button>
                <b-button variant="primary">
                  <font-awesome-icon icon="info-circle" fixed-width size="lg" />
                </b-button>
                <b-button variant="info">
                  <font-awesome-icon icon="heart" fixed-width size="lg" />
                </b-button>
              </b-button-group>
            </b-card>
          </b-col>
          <b-col cols="3">
            <b-card style="max-width: 20rem;">
              <b-card-img
                :src="require('../assets/images/notebook-1.webp')"
                alt="notebook-1"
                top="true"
              ></b-card-img>

              <b-card-text>Notebook Lenovo Ultrafino Ideapad 3i I3-10110u 4GB 256GB SSD Tela 15,6" Windows 11 - Prata</b-card-text>

              <b-card-title>R$ 2832,99</b-card-title>

              <b-button-group style="width: 100%">
                <b-button variant="success">
                  <font-awesome-icon icon="cart-plus" fixed-width size="lg" />
                </b-button>
                <b-button variant="primary">
                  <font-awesome-icon icon="info-circle" fixed-width size="lg" />
                </b-button>
                <b-button variant="info">
                  <font-awesome-icon icon="heart" fixed-width size="lg" />
                </b-button>
              </b-button-group>
            </b-card>
          </b-col>
          <b-col cols="3">
            <b-card style="max-width: 20rem;">
              <b-card-img
                :src="require('../assets/images/notebook-1.webp')"
                alt="notebook-1"
                top="true"
              ></b-card-img>

              <b-card-text>Notebook Lenovo Ultrafino Ideapad 3i I3-10110u 4GB 256GB SSD Tela 15,6" Windows 11 - Prata</b-card-text>

              <b-card-title>R$ 2832,99</b-card-title>

              <b-button-group style="width: 100%">
                <b-button variant="success">
                  <font-awesome-icon icon="cart-plus" fixed-width size="lg" />
                </b-button>
                <b-button variant="primary">
                  <font-awesome-icon icon="info-circle" fixed-width size="lg" />
                </b-button>
                <b-button variant="info">
                  <font-awesome-icon icon="heart" fixed-width size="lg" />
                </b-button>
              </b-button-group>
            </b-card>
          </b-col>
          <b-col cols="3">
            <b-card style="max-width: 20rem;">
              <b-card-img
                :src="require('../assets/images/notebook-1.webp')"
                alt="notebook-1"
                top="true"
              ></b-card-img>

              <b-card-text>Notebook Lenovo Ultrafino Ideapad 3i I3-10110u 4GB 256GB SSD Tela 15,6" Windows 11 - Prata</b-card-text>

              <b-card-title>R$ 2832,99</b-card-title>

              <b-button-group style="width: 100%">
                <b-button variant="success">
                  <font-awesome-icon icon="cart-plus" fixed-width size="lg" />
                </b-button>
                <b-button variant="primary">
                  <font-awesome-icon icon="info-circle" fixed-width size="lg" />
                </b-button>
                <b-button variant="info">
                  <font-awesome-icon icon="heart" fixed-width size="lg" />
                </b-button>
              </b-button-group>
            </b-card>
          </b-col>
        </b-row>
      </div>
    </div>
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