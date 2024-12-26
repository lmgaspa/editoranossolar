<template>
  <button @click="redirectToCheckout">Pagar com Stripe</button>
</template>

<script lang="ts">
import { defineComponent } from "vue";
import stripePromise from "../stripe";

export default defineComponent({
  name: "CheckoutButton",
  methods: {
    async redirectToCheckout() {
      const stripe = await stripePromise;

      await stripe?.redirectToCheckout({
        lineItems: [
          { price: 'ID_DO_PREÇO', quantity: 1 }, // Substitua pelo ID do preço do Stripe
        ],
        mode: 'payment',
        successUrl: 'http://localhost:5174/sucesso', // URL de sucesso
        cancelUrl: 'http://localhost:5174/cancelado', // URL de cancelamento
      });
    },
  },
});
</script>
