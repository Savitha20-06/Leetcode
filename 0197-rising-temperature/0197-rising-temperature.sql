# Write your MySQL query statement below
select id
from(
    select id,temperature,recordDate,
    lag(temperature) over (order by recordDate) as prev_temp,
    lag(recordDate) over (order by recordDate) as prev_date
    from Weather
)t
where datediff(recordDate,prev_date)=1
and temperature>prev_temp;
