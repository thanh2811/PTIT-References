.model small
.stack 100h
.data         
     num1 db 3
     num2 db 8
     gcd db ?
     lcm db ? 
     gcdmsg db 'UCLN: $'
     lcmmsg db 'BCNN: $'  
     crlf db 10,'$'
.code
begin:
    MOV AX ,@data
    MOV DS,AX
    
    xor ax,ax
    xor bx, bx
    
    mov al, num1
    mov bl, num2
    
    cmp al, 0
    jne con1
    add al, bl
    mov gcd, al
    jmp FLCM 
    
    con1:
    cmp bl,0
    jne con2
    add al, bl
    mov gcd, al
    jmp FLCM
    
    con2:
    cmp al, bl
    jz GCD1
    jg con3
    sub bl, al
    jmp con2
    con3:
    sub al, bl
    jmp con2
    
    GCD1:
    mov gcd, al
    lea dx, gcdmsg
    mov ah,9
    int 21h
    
    mov dl, gcd
    add dl, '0'
    mov ah, 2
    int 21h
    
    lea dx, crlf
    mov ah, 9
    int 21h
    FLCM: 
    xor ax, ax
    xor bx, bx
    
    mov al, num1
    mov bl, num2
    
    mul bl
    
    mov bl, gcd
    div bl
    ;mov lcm, al
    mov bl, al
    
    lea dx, lcmmsg
    mov ah, 9
    int 21h
    mov lcm , al
    xor si, si
    printLCM:
        cmp bl,0
        jz XXX 
        xor ax,ax
        xor cx,cx
        xor dx,dx
        mov al, bl  
        mov cl,10
        div cl
        mov bl, al  
        mov dl, ah
        add dl, '0' 
        push dx
        inc si
        jmp printLCM
    XXX:
    mov cx, si
    print:
       pop dx
       mov ah, 2
       int 21h
       loop print
    
    OUTT:    
    MOV AH,4CH
    INT 21H
end begin