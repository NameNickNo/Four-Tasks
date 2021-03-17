WITH dedetermine_index_and_misstermine AS
         (SELECT index,
                 (index - lag(index, 1) over (ORDER BY index)) - 1 AS lag
          FROM numbers)
SELECT (d.index - d.lag) AS miss_position, d.lag AS count
FROM determine_index_and_miss d
WHERE d.lag > 0;