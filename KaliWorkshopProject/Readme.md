# Kali Workshop hands on project.
Roger Ramírez Espejo.<br />
Software engineer, architect and enthusiast.
## Table of contents.


## Introduction.
This project shows the usage of several tools provided by Kali linux, which help to evaluate the security of our technology appliances. 

The content contained here is only displayed for educational purposes and their usage is not responsibility of the author.

## DNS Recognize
Sniffer that shows the address of the machine: 
```
from scapy.all import *

a = IP()
a.show()
```
Result:
![Scapy show IP](evidences/Scapy_show_IP.png)

## Sniffer script with filtering `ICMP` Packages
Script:
```
from scapy.all import *

def print_pkt(pkt):
    pkt.show()
pkt = sniff(filter='icmp', prn=print_pkt)
```
Result:

![ICMP Packets](evidences/ICMP_Packets.png)

## Sniffer script with filtering `TCP` Packages
Script:
```
from scapy.all import *

def print_pkt(pkt):
    pkt.show()
pkt = sniff(filter='tcp', prn=print_pkt)
```
Result

![tcp Packets](evidences/TCP_Packets.png)


## TCP Packets from IP `192.168.0.6` and port `23`
Script:

```
from scapy.all import *

def print_pkt(pkt):
    pkt.show()
pkt = sniff(filter='tcp and src 192.168.50.165 and port 23', prn=print_pkt)
```

Result:

In first instance I couldn't capture any traffic because not traffic was generated in that port. But after runnin `telnet www.google.com` traffic could be captured:

![Telnet port](evidences/Telnet_Port_Localhost.png)

## TCP Packets from subnet `10.0.0.0/8`
Script:
```
from scapy.all import *

def print_pkt(pkt):
    pkt.show()
pkt = sniff(filter='tcp and net 10.0.0.0/8', prn=print_pkt)
```
Results:

![tcp subnet](evidences/TCP_subnet.png)


## Cracking WiFi networks.
