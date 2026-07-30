-- Insert Dummy Data for Market Prices
INSERT INTO market_price (crop_name, market_name, price_per_quintal, unit, last_updated) VALUES
('Paddy', 'Hyderabad Market', 2200.50, 'Quintal', CURRENT_TIMESTAMP),
('Cotton', 'Warangal Market', 7500.00, 'Quintal', CURRENT_TIMESTAMP),
('Maize', 'Nizamabad Market', 1950.00, 'Quintal', CURRENT_TIMESTAMP),
('Tomato', 'Khammam Market', 3000.00, 'Quintal', CURRENT_TIMESTAMP)
;

-- Insert Dummy Data for Subsidies
INSERT INTO subsidy (scheme_name, category, government_rate, market_rate, farmer_price, district, mandal, description, start_date, last_date, required_documents, eligibility) VALUES
('PM-Kisan Samman Nidhi', 'Direct Benefit Transfer', 6000.00, 6000.00, 0.00, 'All', 'All', 'Income support to all landholding farmer families.', '2023-01-01', '2025-12-31', 'Aadhar Card, Bank Passbook, Land Pattadar Passbook', 'Small and Marginal Farmers'),
('Rythu Bandhu', 'Investment Support', 5000.00, 5000.00, 0.00, 'Telangana', 'All', 'Investment support for agriculture and horticulture crops per acre per season.', '2023-06-01', '2025-12-31', 'Aadhar, Bank Details, Land Documents', 'Farmers in Telangana')
;

-- Insert Dummy Data for Farming Tips
INSERT INTO farming_tips (crop_name, category, stage, title, description) VALUES
('Paddy', 'Fertilizer Management', 'Vegetative', 'Urea Application', 'Apply urea in 3 splits for better yield. First split at 15 days after transplanting.'),
('Cotton', 'Pest Control', 'Flowering', 'Pink Bollworm Management', 'Use pheromone traps and spray recommended insecticides at early infestation.'),
('Tomato', 'Disease Management', 'Fruiting', 'Early Blight Control', 'Spray Mancozeb at 2g/litre of water as soon as symptoms appear.')
;

-- Insert Dummy Data for Experts
INSERT INTO expert (expert_name, specialization, district, mandal, phone_number, email, office_name, available_days, available_time) VALUES
('Dr. Ramesh Kumar', 'Plant Pathology', 'Hyderabad', 'Rajendranagar', '9876543210', 'ramesh.agri@example.com', 'Agricultural University', 'Mon, Wed, Fri', '10:00 AM - 1:00 PM'),
('Dr. Sunitha Reddy', 'Soil Science', 'Warangal', 'Hanamkonda', '8765432109', 'sunitha.soil@example.com', 'KVK Warangal', 'Tue, Thu, Sat', '2:00 PM - 5:00 PM')
;
