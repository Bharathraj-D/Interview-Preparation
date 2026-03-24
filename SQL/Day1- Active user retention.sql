with cte as (SELECT distinct user_id FROM user_actions 
where 
EXTRACT(MONTH from event_date) = 7 AND
EXTRACT(YEAR FROM event_date) = 2022
INTERSECT
SELECT distinct user_id FROM user_actions 
where 
EXTRACT(MONTH from event_date)=6 AND
EXTRACT(YEAR FROM event_date)=2022)
select '7' as month,count(user_id) as monthly_active_users from cte;


