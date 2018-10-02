import hashlib
import datetime
import time

_start = datetime.datetime.now()
_now = datetime.datetime.now()
_elapsed = datetime.datetime.now()
_stop = datetime.datetime.now()
str = b'some message to release a hash'

def start():
    _start = datetime.datetime.now()
    return _start

def elapsed():
    _elapsed = datetime.datetime.now() - _start
    return _elapsed



def mesuare(type):
    if type == 'md5':
        run_md5(type)    
        print()    
    elif type == 'sha1':
        run_sha1(type)
        print()
    elif type == 'sha224':
        run_sha224(type)
        print()
    elif type == 'sha256':
        run_sha256(type)
        print()
    elif type == 'sha384':
        run_sha384(type)
        print()


def run_md5(type):
    start()
    my_hash = hashlib.md5()
    my_hash.update(str)    
    print(my_hash.digest())
    print('Tempo levado para gerar um hash {0}: {1}'.format(type, elapsed()))

def run_sha1(type):
    start()
    my_hash = hashlib.sha1()
    my_hash.update(str)
    print(my_hash.digest())
    print('Tempo levado para gerar um hash {0}: {1}'.format(type, elapsed()))

def run_sha224(type):
    start()
    my_hash = hashlib.sha224()
    my_hash.update(str)
    print(my_hash.digest())
    print('Tempo levado para gerar um hash {0}: {1}'.format(type, elapsed()))

def run_sha256(type):
    start()
    my_hash = hashlib.sha256()
    my_hash.update(str)
    print(my_hash.digest())
    print('Tempo levado para gerar um hash {0}: {1}'.format(type, elapsed()))

def run_sha384(type):
    start()
    my_hash = hashlib.sha384()
    my_hash.update(str)
    print(my_hash.digest())
    print('Tempo levado para gerar um hash {0}: {1}'.format(type, elapsed()))

mesuare('md5')
mesuare('sha1')
mesuare('sha224')
mesuare('sha256')
mesuare('sha384')