<template>
  <div class="container mt-4">
    <h1 class="text-center">Entrar</h1>
    <form @submit.prevent="handleLogin">
      <div class="mb-3">
        <label for="email" class="form-label">E-mail</label>
        <input
          type="email"
          class="form-control"
          id="email"
          v-model="email"
          placeholder="Digite seu e-mail"
          required
        />
      </div>
      <div class="mb-3">
        <label for="password" class="form-label">Senha</label>
        <div class="input-group">
          <input
            :type="isPasswordVisible ? 'text' : 'password'"
            class="form-control"
            id="password"
            v-model="password"
            placeholder="Digite sua senha"
            required
          />
          <button
            type="button"
            class="btn btn-outline-secondary"
            @click="togglePasswordVisibility"
          >
            <i :class="isPasswordVisible ? 'bi bi-eye' : 'bi bi-eye-slash'"></i>
          </button>
        </div>
      </div>
      <div class="text-center">
        <button
          type="submit"
          class="btn btn-primary"
          :disabled="!isFormValid"
        >
          Entrar
        </button>
      </div>
    </form>
    <p class="mt-3 text-center">
      Não tem uma conta?
      <router-link to="/register" class="text-decoration-underline">Registre-se aqui</router-link>.
    </p>
  </div>
</template>

<script lang="ts">
import { defineComponent, ref, computed } from "vue";

export default defineComponent({
  name: "Login",
  setup() {
    const email = ref("");
    const password = ref("");
    const isPasswordVisible = ref(false); // Inicialmente o olho está fechado (senha oculta)

    function togglePasswordVisibility() {
      isPasswordVisible.value = !isPasswordVisible.value;
    }

    const isFormValid = computed(() => email.value && password.value);

    function handleLogin() {
      if (isFormValid.value) {
        alert("Login realizado com sucesso!");
        // Aqui você pode integrar com o backend para autenticação
      } else {
        alert("Por favor, preencha os campos corretamente.");
      }
    }

    return {
      email,
      password,
      isPasswordVisible,
      togglePasswordVisibility,
      isFormValid,
      handleLogin,
    };
  },
});
</script>

<style scoped>
.container {
  max-width: 400px;
  margin: auto;
}
.text-center {
  text-align: center;
}
</style>
