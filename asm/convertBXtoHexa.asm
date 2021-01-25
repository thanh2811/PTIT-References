.model samll
.stack 100
.data 
  
.code      
macro print a
    mov bx, a
    mov cx, 4
    mov ah, 2  
    
    
  inra:
    rol bx, 4
    mov dl, bl
    and dl, 0Fh
    cmp dl, 9
    jg  chu
    jmp so
  chu:
    add dl, 'A'
    sub dl, 10
    jmp xuat
  so:
    add dl, '0'
    jmp xuat
  xuat:
    int 21h
  loop inra
    mov dl, 'H'
    int 21h
endm
    
main proc 
    mov ax, @data
    mov ds, ax
    print 25
    mov ah, 4ch
    int 21h    
main endp