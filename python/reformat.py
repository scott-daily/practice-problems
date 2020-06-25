# Script to reformat a spreadsheet's data to match database schema before insertion into a MySQL Database

import re

f = open("original.txt", "r")
for line in f:
    line = re.split(r'\t+', line.rstrip('\n'))
    
    date_list = line[2].split('/')
    if len(date_list[2]) < 4:
        date_list[2] = "20" + str(date_list[2])

    date_format = "\'" + date_list[2] + '-' + date_list[1] + '-' + date_list[0] + "\'"
    print("(" + line[0] + ',' + line[1] + date_format + "),")