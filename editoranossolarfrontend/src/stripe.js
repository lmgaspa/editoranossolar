import { loadStripe } from '@stripe/stripe-js';

const stripePromise = loadStripe('SUA_CHAVE_PUBLICA_DO_STRIPE');

export default stripePromise;
