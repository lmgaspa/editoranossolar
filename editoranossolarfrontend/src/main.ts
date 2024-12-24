import { createApp } from 'vue';
import App from './App.vue';
import router from "./router";
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';

const app = createApp(App);

// Adicione o router à instância do Vue
app.use(router);

// Monte a aplicação
app.mount("#app");
