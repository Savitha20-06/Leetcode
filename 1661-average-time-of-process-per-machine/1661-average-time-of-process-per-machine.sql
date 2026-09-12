# Write your MySQL query statement below
select machine_id,round(avg(timestamp - prev_time),3) as processing_time
from
(
   select machine_id,process_id,activity_type,timestamp,
   lag(timestamp) over (partition by machine_id,process_id order by timestamp) as prev_time
   from Activity
)t
where activity_type='end'
group by machine_id;