# Kali Workshop hands on project.
Roger Ramírez Espejo.<br />
Software engineer, architect and enthusiast. <br />
Cybersecurity Project - Kali linux workshop
## Table of contents.


## Introduction.
This project shows the usage of several tools provided by [Kali linux](https://www.kali.org/), which help to evaluate the security of our technology appliances. In this workshop there were used the following versions of Kali Linux:

<kbd>![Kali versions](evidences/0.1_Kali_Versions.png)</kbd>

- [Bare Metal](https://www.kali.org/get-kali/#kali-bare-metal): Installable version which was intalled in an old laptop. This version was used to execute the Wifi cracking section.
- [Virtual Box - VM](https://www.kali.org/get-kali/#kali-virtual-machines): Virtual box version of the operative system. Used to execute the rest of the project except the Wifi cracking section.

<br />

### Disclaimer
This Workshop and it's results were performed only for educational purposes. Any misusage of the information of this report is not responsibility of the author. Discresion is adviced.

Depending on the time of reading of this report some features might changed or replaced by diferent tools.

## Information Gathering.
This section shows the following tools:

- [Dmitry](https://tools.kali.org/information-gathering/dmitry): DMitry (Deepmagic Information Gathering Tool) is a UNIX/(GNU)Linux Command Line Application coded in C. DMitry has the ability to gather as much information as possible about a host. Base functionality is able to gather possible subdomains, email addresses, uptime information, tcp port scan, whois lookups, and more. 
- [DNSEnum](https://tools.kali.org/information-gathering/dnsenum): Multithreaded perl script to enumerate DNS information of a domain and to discover non-contiguous ip blocks.
- [Nmap](https://nmap.org/): Mapping appliance which display the details of the devices connected to the current network.

These tools are located under information gathering section in start menu in kali linux:

<kbd>![InformationGatherin](evidences/1.0_InformationGatherinToolsKali.png)</kbd>

### Deepmagic for reconnaissance
The objective of this section is to explore the server information of sites such as [Rappi.com](https://rappi.com) and [Yahoo.com](https://yahoo.com) in order to reconnaisse their DNS information:

Command below will help to gather as much information as possible about the host [Rappi.com](https://rappi.com)
```
dmtry rappi.com
```
Domain name information:
```
  Domain Name: RAPPI.COM
   Registry Domain ID: 87997065_DOMAIN_COM-VRSN
   Registrar WHOIS Server: whois.godaddy.com
   Registrar URL: http://www.godaddy.com
   Updated Date: 2021-01-19T21:04:12Z
   Creation Date: 2002-06-30T06:54:15Z
   Registry Expiry Date: 2026-06-30T06:59:38Z
   Registrar: GoDaddy.com, LLC
   Registrar IANA ID: 146
   Registrar Abuse Contact Email: abuse@godaddy.com
   Registrar Abuse Contact Phone: 480-624-2505
   Domain Status: clientDeleteProhibited https://icann.org/epp#clientDeleteProhibited
   Domain Status: clientRenewProhibited https://icann.org/epp#clientRenewProhibited
   Domain Status: clientTransferProhibited https://icann.org/epp#clientTransferProhibited
   Domain Status: clientUpdateProhibited https://icann.org/epp#clientUpdateProhibited
   Name Server: NS-1018.AWSDNS-63.NET
   Name Server: NS-1254.AWSDNS-28.ORG
   Name Server: NS-1908.AWSDNS-46.CO.UK
   Name Server: NS-62.AWSDNS-07.COM
   DNSSEC: unsigned
   URL of the ICANN Whois Inaccuracy Complaint Form: https://www.icann.org/wicf/
>>> Last update of whois database: 2021-06-28T17:02:18Z <<<

For more information on Whois status codes, please visit https://icann.org/epp
```
Found subdomains of [Rappi.com](https://rappi.com)
```
Searching Google.com:80...
HostName:www.rappi.com
HostIP:13.227.26.87
HostName:aliados.rappi.com
HostIP:13.227.26.21
HostName:partners.rappi.com
HostIP:13.227.26.21
HostName:mitienda.rappi.com
HostIP:13.227.26.117
HostName:blog.rappi.com
HostIP:35.165.115.229
HostName:promos.rappi.com
HostIP:198.185.159.144
HostName:brands.rappi.com
HostIP:13.227.26.119
HostName:legal.rappi.com
HostIP:44.230.206.229
HostName:www.restaurantes.rappi.com
HostIP:3.229.159.122
HostName:ads.rappi.com
HostIP:13.227.26.8
HostName:lives.rappi.com
HostIP:13.227.26.88
HostName:lupe.rappi.com
HostIP:13.227.26.38
HostName:travel4business.rappi.com
HostIP:13.227.26.68
HostName:cms-growth.rappi.com
HostIP:13.227.26.78
HostName:retail-cms.rappi.com
HostIP:13.227.26.95
HostName:erp-shoppers.rappi.com
HostIP:13.227.26.62
HostName:viajes.rappi.com
HostIP:13.227.26.91
HostName:help.partners.rappi.com
HostIP:13.227.26.5                                                             
HostName:rappipay.rappi.com                                                     
HostIP:13.227.26.102                                                                
HostName:microservices.dev.rappi.com                                                      
HostIP:13.227.26.56                                                                            
HostName:dev-portal.rappi.com                                                                          
HostIP:13.227.26.122                                                                                   
HostName:images.rappi.com                                                                                    
HostIP:13.227.26.111                                                                                         
Searching Altavista.com:80...                                                                                     
Found 22 possible subdomain(s) for host rappi.com, Searched 0 pages containing 0 results
```

Dmitry also displays information about emails, however no email information was found for the host  [Rappi.com](https://rappi.com). However the same command `dmitry` was executed over [Yahoo.com](https://yahoo.com), `dmitry yahoo.com` returning the following email results:

```
Gathered E-Mail information for yahoo.com
---------------------------------
Searching Google.com:80...
yourname@yahoo.com
stlb@yahoo.com
alguien@yahoo.com
sbwoodside@yahoo.com
mphciencia@yahoo.com
dges@yahoo.com
noelbadges@yahoo.com
30002000@yahoo.com
rubieraj@yahoo.com
susanaesposito29@yahoo.com
rpedace3990@yahoo.com
sendyourpictures@yahoo.com
hai@yahoo.com
rifervia@yahoo.com
aimee.steppingstones@yahoo.com
urusjavier@yahoo.com
delagarzaopina@yahoo.com
rasaucedob@yahoo.com
jonesgd68@yahoo.com
base1@yahoo.com
farmaluiscordero@yahoo.com
edwale1981@yahoo.com
darylmwalker@yahoo.com
gcoladonato@yahoo.com
titovmv@yahoo.com
solyanik2002@yahoo.com
husainfive@yahoo.com
kristoffersonkris@yahoo.com
dbnellis@yahoo.com
juliedlynch@yahoo.com
kfzhouy@yahoo.com
ono00@yahoo.com
grassfairy@yahoo.com
lilianamaya60@yahoo.com
privacy@es.yahoo.com
leroymunsey@yahoo.com
mendofrank@yahoo.com
sa@yahoo.com
stopgapnow@yahoo.com
fan02@yahoo.com
mtdew77@yahoo.com
siqueiros74@yahoo.com
figo2472000@yahoo.com
hendrixson@yahoo.com
sohailshafii@yahoo.com
Voyager1063@yahoo.com
jzarra@yahoo.com
lee123@yahoo.com
rpinecorfu@yahoo.com
pkchatterjee5@yahoo.com
alejococinero@yahoo.com
james.nalley@yahoo.com
kidsfirstdhfcc@yahoo.com
ange@yahoo.com
lindsaycwright@yahoo.com
millerjon34@yahoo.com
zhong@yahoo.com
jl5909@yahoo.com
20JoSmiles@yahoo.com
JoSmiles@yahoo.com
jbprolrm@yahoo.com
amber@yahoo.com
beach5sandsoccer@yahoo.com
trishwoolbright@yahoo.com
normaosti@yahoo.com
billybob@yahoo.com
sbgogia1955@yahoo.com
liz.murnin@yahoo.com
ximenadebaquero@yahoo.com
marceloaustria@yahoo.com
citotia@yahoo.com
```

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
