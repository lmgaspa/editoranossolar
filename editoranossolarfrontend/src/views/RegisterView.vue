<template>
  <div class="container mt-4">
    <h1 class="text-center">Cadastrar</h1>
    <form @submit.prevent="handleSubmit">
      <div class="mb-3">
        <label for="name" class="form-label">Nome</label>
        <input
          type="text"
          class="form-control"
          id="name"
          v-model="name"
          placeholder="Digite seu nome"
          required
        />
      </div>
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
        <small class="text-muted">Senha deve conter no mínimo 8 caracteres.</small>
        <div v-if="password && password.length < 8" class="text-danger">
          Senha muito curta.
        </div>
      </div>
      <div class="text-center">
        <button
          type="submit"
          class="btn btn-primary"
          :disabled="!isFormValid"
        >
          Cadastrar
        </button>
      </div>
    </form>
    <p class="mt-3 text-center">
      Já tem uma conta?
      <router-link to="/login" class="text-decoration-underline">Clique aqui para entrar</router-link>.
    </p>
  </div>
</template>

<script lang="ts">
import { defineComponent, ref, computed } from "vue";

export default defineComponent({
  name: "Register",
  setup() {
    const isPasswordVisible = ref(false);
    const name = ref("");
    const email = ref("");
    const password = ref("");

    function togglePasswordVisibility() {
      isPasswordVisible.value = !isPasswordVisible.value;
    }

    const isFormValid = computed(() => {
      return (
        name.value &&
        email.value &&
        password.value.length >= 8
      );
    });

    function handleSubmit() {
      if (isFormValid.value) {
        alert("Cadastro realizado com sucesso!");
        // Aqui você pode enviar os dados ao backend
      } else {
        alert("Por favor, preencha os campos corretamente.");
      }
    }

    return {
      isPasswordVisible,
      name,
      email,
      password,
      togglePasswordVisibility,
      isFormValid,
      handleSubmit,
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
.text-danger {
  font-size: 0.875rem;
}
</style>
