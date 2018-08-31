# -*- coding: UTF-8 -*-
from snownlp import SnowNLP
import sys

def NewsProcess(data):
    s = SnowNLP(data)
    print(s.words)
    print("##"+str(s.sentiments))

NewsProcess(sys.argv[1])