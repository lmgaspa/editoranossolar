<template>
    <div class="container">
      <div class="row justify-content-center">
        <div
          class="col-12 col-sm-8 col-md-6 col-lg-4 d-flex align-items-stretch mb-4"
          v-for="(product, index) in products"
          :key="index"
        >
          <div class="card product-card">
            <img :src="product.image" class="card-img-top" alt="Product Image" />
            <div class="card-body">
              <h5 class="card-title">{{ product.name }}</h5>
              <p class="card-text">{{ product.description }}</p>
              <p class="card-text"><strong>R$ {{ product.price.toFixed(2) }}</strong></p>
              <button class="btn btn-primary">Adicionar ao Carrinho</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </template>
  
  <script lang="ts">
  export default {
    name: "ProductList",
    data() {
      return {
        products: [
          {
            name: "Sonhos não são impossíveis",
            description: "Autoria de Carneiro",
            price: 29.99,
            image: "https://via.placeholder.com/150",
          },
          {
            name: "Uma evangélica no mundo espiritual",
            description: "Autoria de Mauricio de Castro",
            price: 39.99,
            image: "https://via.placeholder.com/150",
          },
          {
            name: "O pequeno Julian",
            description: "Autoria de Laszlo",
            price: 49.99,
            image: "https://via.placeholder.com/150",
          },
        ],
      };
    },
  };
  </script>
  
  <style scoped>
  .container {
    margin-top: 20px;
  }
  
  .row {
    max-width: 1200px; 
    margin: 0 auto; 
  }
  
  .card {
    width: 100%;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    border-radius: 8px;
  }
  
  .product-card {
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    height: 100%;
  }
  
  .card-body {
    text-align: center;
  }
  
  @media (max-width: 992px) {
    .col-md-6 {
      max-width: 70%;
    }
  }
  
  @media (max-width: 768px) {
    .col-sm-8 {
      max-width: 90%;
    }
  }
  
  .mb-4 {
    margin-bottom: 2rem;
  }
  </style>
  