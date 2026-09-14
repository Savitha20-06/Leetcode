# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.salary as Salary
from Employee e 
join Department d
on e.departmentID=d.id
where e.salary = (select max(e2.salary) from Employee e2
WHERE e.departmentID=e2.departmentID);

