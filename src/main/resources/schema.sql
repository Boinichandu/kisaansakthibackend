CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone VARCHAR(15) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS farming_tips (
    id SERIAL PRIMARY KEY,
    crop_name VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    stage VARCHAR(255) NOT NULL,
    title VARCHAR(255) NOT NULL,
    description TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS market_price (
    id SERIAL PRIMARY KEY,
    crop_name VARCHAR(255) NOT NULL,
    market_name VARCHAR(255) NOT NULL,
    price_per_quintal DOUBLE PRECISION NOT NULL,
    unit VARCHAR(255) NOT NULL,
    last_updated TIMESTAMP
);

CREATE TABLE IF NOT EXISTS subsidy (
    id SERIAL PRIMARY KEY,
    scheme_name VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    government_rate DOUBLE PRECISION,
    market_rate DOUBLE PRECISION,
    farmer_price DOUBLE PRECISION,
    district VARCHAR(255),
    mandal VARCHAR(255),
    description TEXT,
    start_date DATE,
    last_date DATE,
    required_documents TEXT,
    eligibility TEXT
);

CREATE TABLE IF NOT EXISTS expert (
    id SERIAL PRIMARY KEY,
    expert_name VARCHAR(255) NOT NULL,
    specialization VARCHAR(255) NOT NULL,
    district VARCHAR(255),
    mandal VARCHAR(255),
    phone_number VARCHAR(255),
    email VARCHAR(255),
    office_name VARCHAR(255),
    available_days VARCHAR(255),
    available_time VARCHAR(255)
);