<template>
    <div class="col-md-4 mb-4">
      <div class="card" style="width: 18rem;">
        <img :src="product.image" class="card-img-top" alt="product image">
        <div class="card-body">
          <h5 class="card-title">{{ product.name }}</h5>
          <p class="card-text">{{ product.description }}</p>
          <p class="card-text">
            <strong>{{ formatPrice(product.price) }}</strong>
          </p>
          <a href="#" class="btn btn-primary">Adicionar ao Carrinho</a>
        </div>
      </div>
    </div>
  </template>
  
  <script lang="ts">
  export default {
    name: 'ProductCard',
    props: {
      product: {
        type: Object,
        required: true,
      },
    },
    methods: {
      formatPrice(price: number): string {
        return new Intl.NumberFormat('pt-BR', {
          style: 'currency',
          currency: 'BRL',
        }).format(price);
      },
    },
  }
  </script>
  
  <style scoped>
  .card {
    margin-bottom: 20px;
  }
  </style>
  