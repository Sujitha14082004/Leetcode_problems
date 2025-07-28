# Write your MySQL query statement below
Select class
FROM Courses
GROUP BY class
HAVING count(student)>4