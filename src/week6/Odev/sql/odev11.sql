--actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
select first_name from actor
UNION
select first_name from customer
ORDER BY first_name;

--actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
select first_name from actor
INTERSECT
select first_name from customer
ORDER BY first_name;


--actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.
select first_name from actor
EXCEPT
select first_name from customer
ORDER BY first_name;

--İlk 3 sorguyu tekrar eden veriler için de yapalım.
select first_name from actor
UNION ALL
select first_name from customer
ORDER BY first_name;

select first_name from actor
INTERSECT ALL
select first_name from customer
ORDER BY first_name;

select first_name from actor
EXCEPT ALL
select first_name from customer
ORDER BY first_name;




