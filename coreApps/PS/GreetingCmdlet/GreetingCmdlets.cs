using System;
using System.Management.Automation;

namespace MyPowerShellCmdlets
{
    [Cmdlet(VerbsCommon.Get, "Greeting")]
    public class GetGreetingCmdlet : Cmdlet
    {
        [Parameter(Mandatory = true)]
        public string Name { get; set; }

        protected override void ProcessRecord()
        {
            WriteObject($"Hello, {Name}!");
        }
    }
}

