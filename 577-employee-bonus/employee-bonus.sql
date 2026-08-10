# Write your MySQL query statement below
SELECT e.name, b.bonus From Employee AS e
left join Bonus as b on e.empId=b.empId
where b.bonus<1000 or b.bonus is null;
