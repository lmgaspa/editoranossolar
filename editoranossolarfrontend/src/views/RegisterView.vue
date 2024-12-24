<template>
    <div class="container mt-4">
      <h1>Cadastrar</h1>
      <form>
        <div class="mb-3">
          <label for="name" class="form-label">Nome</label>
          <input type="text" class="form-control" id="name" placeholder="Digite seu nome" />
        </div>
        <div class="mb-3">
          <label for="email" class="form-label">E-mail</label>
          <input type="email" class="form-control" id="email" placeholder="Digite seu e-mail" />
        </div>
        <div class="mb-3">
          <label for="password" class="form-label">Senha</label>
          <input type="password" class="form-control" id="password" placeholder="Digite sua senha" />
        </div>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
      </form>
    </div>
  </template>
  
  <script lang="ts">
  export default {
    name: 'Register',
  };
  </script>
  
  <style scoped>
  .container {
    max-width: 400px;
    margin: auto;
  }
  </style>
  