-- Write your PostgreSQL query statement below
-- we are going to solve this two approach-


-- --  approach 1
SELECT (select distinct salary
        from Employee 
        order by salary desc
        limit 1 offset 1) AS secondHighestSalary;

-- -- approach 2 
-- select max(salary) AS secondHighestSalary 
-- from Employee where salary < (select max(salary) from Employee);


