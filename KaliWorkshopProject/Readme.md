# Kali Workshop hands on project.
Roger Ramírez Espejo.<br />
Software engineer, architect and enthusiast. <br />
Cybersecurity Project - Kali linux workshop
## Table of contents.


## Introduction.
This project shows the usage of several tools provided by [Kali linux](https://www.kali.org/), which help to evaluate the security of our technology appliances. In this workshop there were used the following versions of Kali Linux:

![Kali versions](evidences/0.1_Kali_Versions.png)
- [Bare Metal](https://www.kali.org/get-kali/#kali-bare-metal): Installable version which was intalled in an old laptop. This version was used to execute the Wifi cracking section.
- [Virtual Box - VM](https://www.kali.org/get-kali/#kali-virtual-machines): Virtual box version of the operative system. Used to execute the rest of the project except the Wifi cracking section.

<br />

## Information Gathering.
This section shows the following tools:

- [Dmitry](https://tools.kali.org/information-gathering/dmitry): DMitry (Deepmagic Information Gathering Tool) is a UNIX/(GNU)Linux Command Line Application coded in C. DMitry has the ability to gather as much information as possible about a host. Base functionality is able to gather possible subdomains, email addresses, uptime information, tcp port scan, whois lookups, and more. 
- [DNSEnum](https://tools.kali.org/information-gathering/dnsenum): Multithreaded perl script to enumerate DNS information of a domain and to discover non-contiguous ip blocks.
- [Nmap](https://nmap.org/): Mapping appliance which display the details of the devices connected to the current network.

These tools are located under information gathering section in start menu in kali linux:

![InformationGatherin](evidences/1.0_InformationGatherinToolsKali.png)

### DNSEnum


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
