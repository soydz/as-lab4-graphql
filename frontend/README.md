# Frontend React con TanStack Query y GraphQL

Este proyecto es una aplicación **frontend** construida con **React** y **TypeScript**, que consume datos desde un API **GraphQL** utilizando **TanStack Query** para el manejo eficiente de datos asíncronos.

---

## 🚀 Tecnologías principales

* **React** (con Vite o CRA, según corresponda)
* **TypeScript**
* **TanStack Query (React Query)**
* **GraphQL**
* **TailwindCSS**

---

## 📦 Instalación

Clona el repositorio e instala las dependencias:

```bash
git clone https://github.com/daluz0221/lab4
cd lab4
npm install
```

---

## 🛠️ Configuración del cliente GraphQL

Este proyecto utiliza un cliente GraphQL para hacer las peticiones. Un ejemplo con **graphql-request**:

```ts
import { GraphQLClient } from 'graphql-request';

export const client = new GraphQLClient(import.meta.env.VITE_GRAPHQL_URL);
```

Asegúrate de definir el endpoint en tu archivo `.env`:

```env
VITE_GRAPHQL_URL=https://apigrapqhl.com/graphql
```

---

## 🔍 Uso de TanStack Query con GraphQL

Ejemplo básico de un hook usando TanStack Query:

```ts
import { useQuery } from '@tanstack/react-query';
import { client } from '../graphql/client';
import { gql } from 'graphql-request';

const GET_ALERTS = gql`
  query GetAlerts {
    alerts {
      id
      alertType
      responsible
      priority
      driver
      generatingUnit
      state
      generationDate
    }
  }
`;

export const useAlerts = () => {
  return useQuery({
    queryKey: ['alerts'],
    queryFn: async () => client.request(GET_ALERTS),
  });
};
```

---

## ▶️ Levantar el proyecto en desarrollo

```bash
npm run dev
```

Abrir en el navegador:

```
http://localhost:5173
```



---

## 📜 Licencia

Este proyecto está bajo la licencia MIT. Puedes usarlo y modificarlo libremente.

