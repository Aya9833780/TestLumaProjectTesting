SELECT * FROM customers;

insert into customers (fullName, address, phone, email)
	values ("fvbghnjmk6", "weftrgqq4", "+20-153183456341", "feawC1322@example.com");
    
update customers set fullname = "qertbycfginouw" where customerID = 200;

-- Cross join
SELECT c.fullName, i.itemName, o.quantity, c.phone, c.address
FROM customers c
CROSS JOIN orders o
JOIN items i ON o.itemID = i.itemID
WHERE c.customerID = o.customerID;

-- Right outer join
SELECT c.fullName, i.itemName, o.quantity, c.phone, c.address
FROM orders o
RIGHT JOIN customers c ON o.customerID = c.customerID
JOIN items i ON o.itemID = i.itemID;

-- Left outer join
SELECT c.fullName, i.itemName, o.quantity, c.phone, c.address
FROM orders o
LEFT JOIN customers c ON o.customerID = c.customerID
LEFT JOIN items i ON o.itemID = i.itemID;

-- Full outer join
SELECT c.fullName, i.itemName, o.quantity, c.phone, c.address
FROM orders o
LEFT JOIN customers c ON o.customerID = c.customerID
LEFT JOIN items i ON o.itemID = i.itemID

UNION

SELECT c.fullName, i.itemName, o.quantity, c.phone, c.address
FROM orders o
RIGHT JOIN customers c ON o.customerID = c.customerID
RIGHT JOIN items i ON o.itemID = i.itemID;