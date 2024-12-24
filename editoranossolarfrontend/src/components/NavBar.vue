<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-white px-4 py-3">
    <div class="container justify-content-between">
      <!-- Nome da Editora Centralizado -->
      <a class="navbar-brand mx-auto" href="#">Editora Nosso Lar</a>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarNav"
        aria-controls="navbarNav"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav mx-auto">
          <li class="nav-item">
            <router-link to="/" class="nav-link">Home</router-link>
          </li>
          <li class="nav-item">
            <router-link to="/livros" class="nav-link">Livros</router-link>
          </li>
          <li class="nav-item">
            <router-link to="/autores" class="nav-link">Autores</router-link>
          </li>
          <li class="nav-item">
            <router-link to="/contato" class="nav-link">Contato</router-link>
          </li>
          <li class="nav-item">
            <router-link to="/carrinho" class="nav-link">Carrinho</router-link>
          </li>
          <li class="nav-item">
            <router-link to="/login" class="nav-link">Entrar</router-link>
          </li>
          <li class="nav-item">
            <router-link to="/register" class="nav-link">Criar Conta</router-link>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>

<script lang="ts">
import { defineComponent } from "vue";

export default defineComponent({
  name: "NavBar",
});
</script>

<style scoped>
.navbar {
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  text-align: center;
}

/* Ajusta os links */
.nav-link {
  color: #333;
  transition: color 0.3s;
}

.nav-link:hover {
  color: #007bff;
}
</style>
