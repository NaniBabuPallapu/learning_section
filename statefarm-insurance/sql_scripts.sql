--**manual SQL queries** to create your MySQL database schema based on your three entity classes: `User`, `Role`, and `Policy`.


## ✅ **1. Create Table: `roles`**

```sql
CREATE TABLE roles (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    role_name VARCHAR(50) NOT NULL UNIQUE
);
```

## ✅ **2. Create Table: `users`**

```sql
CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL, -- Based on Enum: ADMIN, AGENT, CUSTOMER
    CONSTRAINT chk_role CHECK (role IN ('ADMIN', 'AGENT', 'CUSTOMER'))
);
```

## ✅ **3. Create Table: `policy`**

```sql
CREATE TABLE policy (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    policy_name VARCHAR(100) NOT NULL,
    premium DECIMAL(10, 2) NOT NULL CHECK (premium >= 100.0),
    duration INT NOT NULL CHECK (duration BETWEEN 1 AND 60),
    coverage_amount DECIMAL(15, 2) NOT NULL CHECK (coverage_amount >= 1000.0),
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);
```

## ✅ **4. Optional: Insert Enum Role Values into `roles`**

```sql
INSERT INTO roles (role_name) VALUES ('ADMIN');
INSERT INTO roles (role_name) VALUES ('AGENT');
INSERT INTO roles (role_name) VALUES ('CUSTOMER');
```

### 🔄 Sample Query to View Users and Policies

```sql
SELECT u.name, u.email, p.policy_name, p.premium, p.coverage_amount
FROM users u
JOIN policy p ON u.id = p.user_id;
```
