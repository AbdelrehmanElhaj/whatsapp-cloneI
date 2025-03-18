# WhatsApp Clone Setup Instructions

## Prerequisites
Ensure you have the following installed:

1. **Java 17 (JDK)**
2. **Maven**
3. **Docker** (for running the database and Keycloak)

---

## Clone the Repository
```bash
git clone https://github.com/AbdelrehmanElhaj/whatsapp-clone.git
cd whatsapp-clone
```

---

## Start Services with Docker Compose
Run the following command to start the database and any other required services (including Keycloak if configured in the `docker-compose.yml`):
```bash
docker-compose up -d
```

---


### 2. Access Keycloak
Open your browser and navigate to:
**[http://localhost:9090](http://localhost:9090)**  

Log in with the following credentials:
- **Username**: `admin`
- **Password**: `admin`

### 3. Create a Realm
- Navigate to the **Realms** tab.
- Create a new realm (e.g., `whatsapp-clone-realm`).

### 4. Add a Client
- Go to **Clients** > **Create**.
- Enter the following details:
  - **Client ID**: `whatsapp-clone-client`
  - **Client Protocol**: `openid-connect`
  - **Access Type**: `confidential`
- Save the client.
- Go to the **Credentials** tab and note the **Client Secret**. You’ll need this later.

---

## Access Swagger-UI
Once the application is running, you can access the Swagger UI for API documentation and testing at:
**[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)**

---

## Verify Configuration
Ensure that:
- Docker services (database and Keycloak) are running correctly.
- Keycloak is properly configured with the `whatsapp-clone` and `whatsapp-clone-app`.

---

This setup should enable you to work with the **WhatsApp Clone** project seamlessly. Let us know if you need further assistance! ✨
