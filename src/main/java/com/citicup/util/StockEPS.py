# -*- coding: utf-8 -*-
"""
Created on Tue Sep  11 19:46:21 2018

@author: musheng
"""
import sys
import tushare as ts

def getStockEps(year, season):
    code = []
    eps = []
    data = ts.get_report_data(int(year), int(season))
    s = data.loc[:, ['code', 'eps']]
    print()
    for indexs in s.index:
        code.append(s.loc[indexs].values[0])
        eps.append(s.loc[indexs].values[-1])

    if (len(code) == len(eps)):
        l = len(code)
        for i in range(0, l):
            print(str(code[i]) + ' ' + str(eps[i]))
    else:
        print("nothing")


getStockEps(sys.argv[1], sys.argv[2])