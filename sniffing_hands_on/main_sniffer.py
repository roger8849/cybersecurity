from scapy.all import *

def print_pkt(pkt):
    pkt.show()
pkt = sniff(filter='tcp and src 192.168.50.165 and port 23', prn=print_pkt)


#pkt = sniff(filter='tcp and src host 192.168.0.8 and port 23', prn=print_pkt)
#pkt = sniff(filter='tcp and port 23', prn=print_pkt)
#pkt = sniff(filter='tcp and net 10.0.0.0/8', prn=print_pkt)