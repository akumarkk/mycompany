### kernel mm
alloc_page() function returns a pointer to a struct page, which represents a physical page of memory. This function allocates physical memory pages for use within the kernel, but it does not directly return a virtual address or a logical address that can be accessed directly by kernel code or device drivers.
```
struct page *page;
void *kernel_virtual_address;

page = alloc_page(GFP_KERNEL);
if (!page) {
    // Handle allocation failure
}

kernel_virtual_address = page_address(page);

// Now 'kernel_virtual_address' points to the beginning of the allocated page

```