#include <linux/module.h>
#include <linux/kernel.h>
#include <linux/workqueue.h>

static struct workqueue_struct *my_wq;

static void my_work_handler(struct work_struct *work) {
    printk(KERN_INFO "Work item executed by kworker\n");
}

static DECLARE_WORK(my_work, my_work_handler);

static int __init my_module_init(void) {
    printk(KERN_INFO "Module loaded\n");
    
    my_wq = create_workqueue("my_queue");
    if (my_wq) {
        queue_work(my_wq, &my_work);
    }
    
    return 0;
}

static void __exit my_module_exit(void) {
    destroy_workqueue(my_wq);
    printk(KERN_INFO "Module unloaded\n");
}

module_init(my_module_init);
module_exit(my_module_exit);

MODULE_LICENSE("GPL");
MODULE_AUTHOR("Anil");
MODULE_DESCRIPTION("A simple example of kworker in C");

