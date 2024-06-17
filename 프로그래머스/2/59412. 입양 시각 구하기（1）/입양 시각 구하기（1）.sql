-- 코드를 입력하세요
SELECT 
    TO_CHAR(DATETIME, 'FMHH24') AS HOUR,
    COUNT(*) AS COUNT
FROM ANIMAL_OUTS
GROUP BY TO_CHAR(DATETIME, 'FMHH24')
HAVING TO_NUMBER(TO_CHAR(DATETIME, 'FMHH24')) BETWEEN 9 AND 19
ORDER BY TO_NUMBER(TO_CHAR(DATETIME, 'FMHH24'));
    