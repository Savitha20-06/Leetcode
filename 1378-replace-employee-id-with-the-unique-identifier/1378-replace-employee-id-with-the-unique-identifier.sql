# Write your MySQL query statement below
select u.unique_id,e.name
from EmployeeUNI U 
right join Employees e
on e.id=u.id;

