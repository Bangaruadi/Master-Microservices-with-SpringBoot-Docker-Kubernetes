INSERT INTO `customer` (`name`, `email`, `mobile_number`, `created_at`, `created_by`) VALUES
('Alice Smith', 'alice.smith@example.com', '1234567890', CURRENT_DATE(), 'system'),
('Bob Johnson', 'bob.johnson@example.com', '0987654321', CURRENT_DATE(), 'system');

INSERT INTO `accounts` (`customer_id`, `account_type`, `branch_address`, `created_at`, `created_by`) VALUES
(1, 'Savings', '123 Main St, Anytown, CA', CURRENT_DATE(), 'system'),
(2, 'Checking', '456 Oak Ave, Somewhere, TX', CURRENT_DATE(), 'system');