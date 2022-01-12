import Vue from 'vue'
import App from './App.vue'

import VueRouter from 'vue-router'
import Routes from "./utils/routes.js";

import { BootstrapVue, BootstrapVueIcons } from "bootstrap-vue";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap-vue/dist/bootstrap-vue.css";

import { library } from "@fortawesome/fontawesome-svg-core";
import { fas } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon, FontAwesomeLayers, FontAwesomeLayersText } from "@fortawesome/vue-fontawesome";

import axios from 'axios'
import VueAxios from 'vue-axios'

import './assets/css/main.css'
import './assets/css/login.css'
import './assets/css/dashboard.css'

Vue.use(VueRouter);

const router = new VueRouter({
  routes: Routes,
  mode: "hash",
});

Vue.use(BootstrapVue);
Vue.use(BootstrapVueIcons);

library.add(fas);
Vue.component("font-awesome-icon", FontAwesomeIcon);
Vue.component("font-awesome-layers", FontAwesomeLayers);
Vue.component("font-awesome-layers-text", FontAwesomeLayersText);

Vue.use(VueAxios, axios)

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  router: router,
}).$mount('#app')
