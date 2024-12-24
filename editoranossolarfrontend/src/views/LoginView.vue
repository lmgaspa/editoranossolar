<template>
    <div class="container mt-4">
      <h1>Entrar</h1>
      <form>
        <div class="mb-3">
          <label for="email" class="form-label">E-mail</label>
          <input type="email" class="form-control" id="email" placeholder="Digite seu e-mail" />
        </div>
        <div class="mb-3">
          <label for="password" class="form-label">Senha</label>
          <input type="password" class="form-control" id="password" placeholder="Digite sua senha" />
        </div>
        <button type="submit" class="btn btn-primary">Entrar</button>
      </form>
    </div>
  </template>
  
  <script lang="ts">
  export default {
    name: 'Login',
  };
  </script>
  
  <style scoped>
  .container {
    max-width: 400px;
    margin: auto;
  }
  </style>
  