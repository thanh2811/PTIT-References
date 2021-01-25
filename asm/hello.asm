.model small
.stack 100h
.data
    crlf db 13,10,'$'
    msg db  'Chào ban!$'  
    ten db 'Thanh$'
.code 
main proc
    mov ax, @data
    mov ds, ax 
    ; dua ra ten
    mov ah,9 
    lea dx,ten
    int 21h
    ; ve dau dong
    mov ah, 9
    lea dx, crlf
    int 21h
    ; hien thi loi chao
    mov ah,9
    lea dx,msg
    int 21h
    ; tro ve dos 
    mov ah,4ch
    int 21h
    main endp
end main