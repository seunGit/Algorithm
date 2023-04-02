-- 코드를 입력하세요
SELECT HISTORY_ID, CAR_ID,
       date_format(start_date,"%Y-%m-%d") as START_DATE,
       # TO_CHAR(start_date,"YYYY-MM-DD") as START_DATE, # Oracle
       date_format(end_date,"%Y-%m-%d") as END_DATE,
       # TO_CHAR(end_date,"YYYY-MM-DD") as END_DATE, # Oracle
       case when datediff(end_date, start_date)+1 >= 30 then "장기 대여"
            else "단기 대여" end as RENT_TYPE
       # if(datediff(end_date, start_date) >=29, "장기 대여", "단기 대여") as RENT_TYPE
            from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where START_DATE like "2022-09-%"
order by HISTORY_ID desc;