import subprocess

def run_command(cmd):
    subprocess.run(cmd, shell=True)  # Vulnerability: Command Injection

run_command("ls")