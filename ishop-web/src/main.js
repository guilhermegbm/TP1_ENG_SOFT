import Vue from 'vue'
import App from './App.vue'

import VueRouter from 'vue-router'
import Routes from "./utils/routes.js";

import { BootstrapVue, BootstrapVueIcons } from "bootstrap-vue";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap-vue/dist/bootstrap-vue.css";

Vue.use(VueRouter);

const router = new VueRouter({
  routes: Routes,
  mode: "hash",
});

Vue.use(BootstrapVue);
Vue.use(BootstrapVueIcons);

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  router: router,
}).$mount('#app')
