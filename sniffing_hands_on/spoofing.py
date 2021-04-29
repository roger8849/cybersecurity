from scapy.all import *
from scapy.layers.inet import IP, ICMP

a = IP()
a.dst = '192.168.50.133'
b = ICMP()
p = a/b
send(p)