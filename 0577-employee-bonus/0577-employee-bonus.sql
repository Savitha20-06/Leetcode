# Write your MySQL query statement below
select name,bonus 
from Employee e
left join Bonus d
on e.empID=d.empId
where bonus is NULL or bonus<1000;