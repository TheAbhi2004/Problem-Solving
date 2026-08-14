# Write your MySQL query statement below
SELECT m.machine_id,
ROUND(AVG(a.timestamp-m.timestamp),3) AS processing_time
FROM Activity m
JOIN Activity a
ON m.machine_id=a.machine_id 
AND m.process_id=a.process_id 
AND m.activity_type='start'
AND a.activity_type='end'
GROUP BY m.machine_id;