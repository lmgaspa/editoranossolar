import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import LivrosView from "../views/LivrosView.vue";
import AutoresView from "../views/AutoresView.vue";
import ContatoView from "../views/ContatoView.vue";
import CarrinhoView from "../views/CarrinhoView.vue";
import LoginView from "../views/LoginView.vue";
import RegisterView from "../views/RegisterView.vue";
import CheckoutButtonView from "../views/CheckoutButtonView.vue";

const routes = [
  { path: "/", name: "Home", component: HomeView },
  { path: "/livros", name: "Livros", component: LivrosView },
  { path: "/autores", name: "Autores", component: AutoresView },
  { path: "/contato", name: "Contato", component: ContatoView },
  { path: "/carrinho", name: "Carrinho", component: CarrinhoView },
  { path: "/login", name: "Login", component: LoginView },
  { path: "/register", name: "Register", component: RegisterView },
  { path: "/checkoutbutton", name: "CheckoutButton", component: CheckoutButtonView },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
