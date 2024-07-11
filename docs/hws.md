### hw

PCIe - 
	a high-speed serial computer expansion bus standard, to enable comm b/w cpu and peripherals.

Mb expansion slots:
 PCIe 6.0 64 GTs, data rate 128GB/s


## ATA vs SATA
ATA (Advanced Technology Attachment)
Definition: ATA, also known as IDE (Integrated Drive Electronics), is an interface standard for connecting storage devices like hard drives and optical drives to a computer's motherboard.
History: Developed in the early 1980s, ATA became the most common interface for consumer PCs.
Speed: ATA/IDE speeds have ranged from the original 8.3 MB/s to the final version, ATA-133, which supports up to 133 MB/s.
Cabling: Typically uses a flat ribbon cable, initially 40-pin and later 80-conductor to support higher speeds.
Connector: Standardized 40-pin connector.
Devices per Channel: Typically supports two devices per channel (one master and one slave).
Market: Primarily used in consumer-grade PCs and laptops.
Hot-swapping: Generally does not support hot-swapping.
 - Hard Disk Drives (HDDs)
 - Optical Drives
 - Solid-State Drives (SSDs): While ATA predates the widespread adoption of SSDs, some SSDs used the ATA interface.

SATA
 - Hard Disk Drives (HDDs)
 - Solid-State Drives (SSDs)
 - Optical Drives: SATA is used for modern optical drives, including CD, DVD, and Blu-ray drives.

SCSI (Small Computer System Interface)
Definition: SCSI is a set of standards for connecting and transferring data between computers and peripheral devices.
History: Developed in the mid-1980s, SCSI was widely used in servers, workstations, and high-performance computing.
Speed: SCSI speeds have evolved from the original 5 MB/s to Ultra-640 SCSI, which supports up to 640 MB/s.
Cabling: Uses a variety of cable types, including parallel cables and more recently, serial (Serial Attached SCSI - SAS) cables.
Connector: Various types, including 50-pin, 68-pin, and newer SAS connectors.
Devices per Channel: Can support a large number of devices per channel (up to 16 with modern versions like SAS).
Market: Primarily used in enterprise environments, including servers and high-performance workstations.
Hot-swapping: Supports hot-swapping, allowing devices to be added or removed without shutting down the system.
- supports a variety of peripheral devices beyond just hard drives.
	- hard drives
	- Optical Drives
	- Tape Drives: Used for data backup and archival purposes.
	- Scanners
	- Printers
	- RAID Controllers:
	- External Storage Enclosures
	- Jukeboxes/Autoloaders
	- Zip Drives: Removable disk storage devices (popular in the late 1990s and early 2000s).
	- MO Drives (Magneto-Optical Drives)

NVMe (Non-Volatile Memory Express)
Definition: NVMe is a high-performance, scalable host controller interface designed specifically for SSDs connected through the PCIe bus.
Speed: NVMe significantly outperforms traditional interfaces like SCSI, offering much higher data transfer rates. It can reach speeds of several gigabytes per second, leveraging the high bandwidth of PCIe.
Latency: NVMe reduces latency compared to SCSI, providing quicker access to data, which is crucial for demanding applications.
Protocol: NVMe uses a streamlined command set optimized for flash-based storage, enhancing efficiency and performance.
Applications: Commonly used in high-performance computing, data centers, and consumer devices requiring fast storage solutions.

HDD/SSD:
 - power connector
 - data (ATA/SATA/SCSI/PCIe) connector

## Motherboard
 - multiple SATA/SCSI/PCIe slots
 - os harddrive in slot-0


## Power connectors:
 - mother board (ATX connectors)
 - PCIe cable
 	- storage(NVMe), Network, Graphics cards 
 - 8/4 pin EPS connection
 - hdd connectors
 	- Molex connectors(hdd)
 	- SATA pw connector
 - CD/DVD connectors
 	- Molex connectors
 	- IDE connector(data) 